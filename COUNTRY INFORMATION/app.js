// --- DOM Elements ---
const countriesGrid = document.getElementById('countries-grid');
const searchInput = document.getElementById('search-input');
const regionFilter = document.getElementById('region-filter');
const themeToggle = document.getElementById('theme-toggle');
const countryModal = document.getElementById('country-modal');
const closeModalBtn = document.getElementById('close-modal');
const modalBody = document.getElementById('modal-body');

// --- Full G20 Static Country Dataset with History Notes ---
const allCountries = [
    {
        name: { common: "Argentina", official: "Argentine Republic" },
        capital: ["Buenos Aires"], region: "Americas", subregion: "South America", population: 45376763,
        flags: { svg: "https://flagcdn.com/ar.svg" }, timezones: ["UTC-03:00"],
        languages: { spa: "Spanish" }, currencies: { ARS: { name: "Argentine Peso", symbol: "$" } },
        maps: { googleMaps: "https://goo.gl/maps/Z6EmYtW6g9YAs9867" },
        history: "Inhabited by indigenous tribes for millennia, Argentina became part of the Spanish Empire in the 16th century. It declared independence in 1816, followed by a period of civil conflicts before emerging as a major agricultural exporter and democracy."
    },
    {
        name: { common: "Australia", official: "Commonwealth of Australia" },
        capital: ["Canberra"], region: "Oceania", subregion: "Australia and New Zealand", population: 25687041,
        flags: { svg: "https://flagcdn.com/au.svg" }, timezones: ["UTC+10:00"],
        languages: { eng: "English" }, currencies: { AUD: { name: "Australian Dollar", symbol: "$" } },
        maps: { googleMaps: "https://goo.gl/maps/D9zaY1676WES7scD7" },
        history: "Home to Aboriginal and Torres Strait Islander peoples for over 65,000 years, Australia saw European maritime exploration in the 17th century. British penal colonization began in 1788, eventually leading to federation as a modern constitutional democracy in 1901."
    },
    {
        name: { common: "Brazil", official: "Federative Republic of Brazil" },
        capital: ["Brasília"], region: "Americas", subregion: "South America", population: 212559409,
        flags: { svg: "https://flagcdn.com/br.svg" }, timezones: ["UTC-03:00"],
        languages: { por: "Portuguese" }, currencies: { BRL: { name: "Brazilian Real", symbol: "R$" } },
        maps: { googleMaps: "https://goo.gl/maps/waCKG7g6vSE67b6w9" },
        history: "Following Portuguese explorer Pedro Álvares Cabral's arrival in 1500, Brazil became a vast sugar and gold producing colony. It achieved independence in 1822 as an Empire, later transitioning into a republic in 1889."
    },
    {
        name: { common: "Canada", official: "Canada" },
        capital: ["Ottawa"], region: "Americas", subregion: "North America", population: 38005238,
        flags: { svg: "https://flagcdn.com/ca.svg" }, timezones: ["UTC-05:00"],
        languages: { eng: "English", fra: "French" }, currencies: { CAD: { name: "Canadian Dollar", symbol: "$" } },
        maps: { googleMaps: "https://goo.gl/maps/bNoR6uxQYwX99ka9A" },
        history: "Originally settled by First Nations and Inuit populations, Canada was colonized by both France and Britain. The British North America Act of 1867 unified the colonies into a self-governing dominion, evolving into a fully independent bilingual nation."
    },
    {
        name: { common: "China", official: "People's Republic of China" },
        capital: ["Beijing"], region: "Asia", subregion: "Eastern Asia", population: 1411171746,
        flags: { svg: "https://flagcdn.com/cn.svg" }, timezones: ["UTC+08:00"],
        languages: { cmn: "Mandarin" }, currencies: { CNY: { name: "Chinese Yuan", symbol: "¥" } },
        maps: { googleMaps: "https://goo.gl/maps/w9fCqCCXwGba6f9CA" },
        history: "As one of the world's oldest civilizations, China's history is marked by successive imperial dynasties that constructed the Great Wall and invented printing, gunpowder, and the compass. The Republic was established in 1912, followed by the People's Republic in 1949."
    },
    {
        name: { common: "France", official: "French Republic" },
        capital: ["Paris"], region: "Europe", subregion: "Western Europe", population: 67391582,
        flags: { svg: "https://flagcdn.com/fr.svg" }, timezones: ["UTC+01:00"],
        languages: { fra: "French" }, currencies: { EUR: { name: "Euro", symbol: "€" } },
        maps: { googleMaps: "https://goo.gl/maps/w7uLitYvRL7g9Jg77" },
        history: "Emerging from ancient Roman Gaul and the medieval Frankish Kingdom, France became a highly powerful centralized state. The French Revolution of 1789 permanently altered global history by dismantling absolute monarchy and championing human rights freedoms."
    },
    {
        name: { common: "Germany", official: "Federal Republic of Germany" },
        capital: ["Berlin"], region: "Europe", subregion: "Western Europe", population: 83240525,
        flags: { svg: "https://flagcdn.com/de.svg" }, timezones: ["UTC+01:00"],
        languages: { deu: "German" }, currencies: { EUR: { name: "Euro", symbol: "€" } },
        maps: { googleMaps: "https://goo.gl/maps/g8uXwBfRvKzG8s7v9" },
        history: "Fragmented into various small states within the Holy Roman Empire for centuries, Germany was formally unified into an empire in 1871. Following the divisions of WWII and the Cold War, the nation reunited in 1990 to form a leading industrial democracy."
    },
    {
        name: { common: "India", official: "Republic of India" },
        capital: ["New Delhi"], region: "Asia", subregion: "Southern Asia", population: 1408044278,
        flags: { svg: "https://flagcdn.com/in.svg" }, timezones: ["UTC+05:30"],
        languages: { hin: "Hindi", eng: "English" }, currencies: { INR: { name: "Indian Rupee", symbol: "₹" } },
        maps: { googleMaps: "https://goo.gl/maps/Wsj8gSD266cy2w7u9" },
        history: "Home to the ancient Indus Valley Civilization, India gave birth to major global religions like Hinduism and Buddhism. Following centuries of influential empires and subsequent British colonial rule, India achieved independence in 1947 through non-violent resistance."
    },
    {
        name: { common: "Indonesia", official: "Republic of Indonesia" },
        capital: ["Jakarta"], region: "Asia", subregion: "South-Eastern Asia", population: 273523621,
        flags: { svg: "https://flagcdn.com/id.svg" }, timezones: ["UTC+07:00"],
        languages: { ind: "Indonesian" }, currencies: { IDR: { name: "Indonesian Rupiah", symbol: "Rp" } },
        maps: { googleMaps: "https://goo.gl/maps/Wv883r728bX99f6v9" },
        history: "An archipelago shaped by vibrant maritime trading kingdoms influenced by Hinduism, Buddhism, and Islam. Indonesia endured nearly three centuries of Dutch colonial rule before declaring independent nationhood at the conclusion of World War II in 1945."
    },
    {
        name: { common: "Italy", official: "Italian Republic" },
        capital: ["Rome"], region: "Europe", subregion: "Southern Europe", population: 59554023,
        flags: { svg: "https://flagcdn.com/it.svg" }, timezones: ["UTC+01:00"],
        languages: { ita: "Italian" }, currencies: { EUR: { name: "Euro", symbol: "€" } },
        maps: { googleMaps: "https://goo.gl/maps/G6qWv7aX8bK2s7v9" },
        history: "The historic cradle of the immense Roman Empire and the birthplace of the transformative European Renaissance. Italy remained split into competing regional states until the Risorgimento nationalist movement achieved complete unification in 1861."
    },
    {
        name: { common: "Japan", official: "Japan" },
        capital: ["Tokyo"], region: "Asia", subregion: "Eastern Asia", population: 125681593,
        flags: { svg: "https://flagcdn.com/jp.svg" }, timezones: ["UTC+09:00"],
        languages: { jpn: "Japanese" }, currencies: { JPY: { name: "Japanese Yen", symbol: "¥" } },
        maps: { googleMaps: "https://goo.gl/maps/w75NX6VihGv1v66e8" },
        history: "An island nation historically ruled by imperial houses and powerful feudal military Shoguns. Japan rapidly modernized during the Meiji Restoration of 1868, ultimately developing into a global technological and economic powerhouse."
    },
    {
        name: { common: "Mexico", official: "United Mexican States" },
        capital: ["Mexico City"], region: "Americas", subregion: "North America", population: 128932753,
        flags: { svg: "https://flagcdn.com/mx.svg" }, timezones: ["UTC-06:00"],
        languages: { spa: "Spanish" }, currencies: { MXN: { name: "Mexican Peso", symbol: "$" } },
        maps: { googleMaps: "https://goo.gl/maps/S72b8r96f6v8b7v9" },
        history: "The seat of complex Mesoamerican civilizations including the Aztecs and Mayans. Mexico was conquered by Spain in 1521, later securing its independence in 1821 after an arduous decade-long war, establishing a culturally rich republic."
    },
    {
        name: { common: "Russia", official: "Russian Federation" },
        capital: ["Moscow"], region: "Europe", subregion: "Eastern Europe", population: 144104080,
        flags: { svg: "https://flagcdn.com/ru.svg" }, timezones: ["UTC+03:00"],
        languages: { rus: "Russian" }, currencies: { RUB: { name: "Russian Ruble", symbol: "₽" } },
        maps: { googleMaps: "https://goo.gl/maps/Z6bWv9k8Y2v8s7v9" },
        history: "Evolving from the medieval state of Kievan Rus', Russia expanded rapidly into a massive transcontinental Tsarist empire. The 1917 Russian Revolution established the Soviet Union (USSR), which later dissolved in 1991 into the modern Russian Federation."
    },
    {
        name: { common: "Saudi Arabia", official: "Kingdom of Saudi Arabia" },
        capital: ["Riyadh"], region: "Asia", subregion: "Western Asia", population: 34813867,
        flags: { svg: "https://flagcdn.com/sa.svg" }, timezones: ["UTC+03:00"],
        languages: { ara: "Arabic" }, currencies: { SAR: { name: "Saudi Riyal", symbol: "r.s" } },
        maps: { googleMaps: "https://goo.gl/maps/W6bWv9k8Y2v8s7v9" },
        history: "The geographic origin point of Islam in the early 7th century. The modern single state structure was unified and officially established by King Abdulaziz Al Saud in 1932, transformed fundamentally by the discovery of commercial oil pools in 1938."
    },
    {
        name: { common: "South Africa", official: "Republic of South Africa" },
        capital: ["Pretoria"], region: "Africa", subregion: "Southern Africa", population: 59308690,
        flags: { svg: "https://flagcdn.com/za.svg" }, timezones: ["UTC+02:00"],
        languages: { eng: "English", zul: "Zulu", xho: "Xhosa" }, currencies: { ZAR: { name: "South African Rand", symbol: "R" } },
        maps: { googleMaps: "https://goo.gl/maps/G6qWv7aX8bK2s7v9" },
        history: "Colonized sequentially by both the Dutch and British, the region was heavily fractured by the institutionalized racial segregation policy known as Apartheid starting in 1948. Peaceful multi-racial democratic transitions were famously won in 1994 under Nelson Mandela."
    },
    {
        name: { common: "South Korea", official: "Republic of Korea" },
        capital: ["Seoul"], region: "Asia", subregion: "Eastern Asia", population: 51780579,
        flags: { svg: "https://flagcdn.com/kr.svg" }, timezones: ["UTC+09:00"],
        languages: { kor: "Korean" }, currencies: { KRW: { name: "South Korean Won", symbol: "₩" } },
        maps: { googleMaps: "https://goo.gl/maps/S72b8r96f6v8b7v9" },
        history: "Boasting ancient dynastic periods, Korea was formally annexed by Japan in 1910. Following WWII, the peninsula was partitioned, resulting in the Korean War. South Korea later achieved an economic surge and transitioned to vibrant civilian democracy."
    },
    {
        name: { common: "Turkey", official: "Republic of Türkiye" },
        capital: ["Ankara"], region: "Asia", subregion: "Western Asia", population: 84339067,
        flags: { svg: "https://flagcdn.com/tr.svg" }, timezones: ["UTC+03:00"],
        languages: { tur: "Turkish" }, currencies: { TRY: { name: "Turkish Lira", symbol: "₺" } },
        maps: { googleMaps: "https://goo.gl/maps/Z6bWv9k8Y2v8s7v9" },
        history: "Bridges Europe and Asia, historical heart of the Byzantine and massive Ottoman Empires. Following the collapse of the Ottoman Empire in WWI, Mustafa Kemal Atatürk founded the modern, secular Republic of Türkiye in 1923."
    },
    {
        name: { common: "United Kingdom", official: "United Kingdom of Great Britain and Northern Ireland" },
        capital: ["London"], region: "Europe", subregion: "Northern Europe", population: 67215293,
        flags: { svg: "https://flagcdn.com/gb.svg" }, timezones: ["UTC+00:00"],
        languages: { eng: "English" }, currencies: { GBP: { name: "British Pound", symbol: "£" } },
        maps: { googleMaps: "https://goo.gl/maps/W6bWv9k8Y2v8s7v9" },
        history: "As the pioneering launchpad of the global Industrial Revolution, the UK controlled the largest empire in human history during the 19th and early 20th centuries. It transitioned over the decades into a influential modern parliamentary monarchy."
    },
    {
        name: { common: "United States", official: "United States of America" },
        capital: ["Washington, D.C."], region: "Americas", subregion: "North America", population: 331449281,
        flags: { svg: "https://flagcdn.com/us.svg" }, timezones: ["UTC-05:00"],
        languages: { eng: "English" }, currencies: { USD: { name: "United States Dollar", symbol: "$" } },
        maps: { googleMaps: "https://goo.gl/maps/33v3g2XNx86YBybZ7" },
        history: "Formed by thirteen British colonies declaring sovereign independence in 1776. The nation expanded westward across North America, survived a defining Civil War, and emerged post-WWII as a global economic and technological superpower."
    }
];

// --- 1. Init Data Directly ---
function fetchCountries() {
    allCountries.sort((a, b) => a.name.common.localeCompare(b.name.common));
    displayCountries(allCountries);
}


// --- 2. Render Cards in UI with Staggered Entry Transitions ---
function displayCountries(countries) {
    countriesGrid.innerHTML = ''; // Clear runtime templates
    
    if (countries.length === 0) {
        countriesGrid.innerHTML = `<div class="loading">No countries match your search parameters.</div>`;
        return;
    }

    countries.forEach((country, index) => {
        const card = document.createElement('div');
        card.classList.add('card');
        
        // Staggered layout delay calculation based on layout array index pacing
        const animationDelay = `${index * 0.04}s`;
        card.style.animationDelay = animationDelay;
        
        const flag = country.flags?.svg;
        const name = country.name?.common || 'N/A';
        const population = country.population?.toLocaleString() || 'N/A';
        const region = country.region || 'N/A';
        const capital = country.capital ? country.capital[0] : 'N/A';

        card.innerHTML = `
            <img src="${flag}" alt="${name} flag" class="card-flag" loading="lazy">
            <div class="card-content">
                <h3>${name}</h3>
                <p><strong>Capital:</strong> ${capital}</p>
                <p><strong>Region:</strong> ${region}</p>
                <p><strong>Population:</strong> ${population}</p>
            </div>
        `;

        card.addEventListener('click', () => showCountryDetails(country));
        countriesGrid.appendChild(card);
    });
}

// --- 3. Filter and Search Logic ---
function filterCountries() {
    const searchTerm = searchInput.value.toLowerCase();
    const selectedRegion = regionFilter.value.toLowerCase();

    const filtered = allCountries.filter(country => {
        const matchesSearch = country.name.common.toLowerCase().includes(searchTerm);
        const matchesRegion = selectedRegion === "" || country.region.toLowerCase() === selectedRegion;
        return matchesSearch && matchesRegion;
    });

    displayCountries(filtered);
}

searchInput.addEventListener('input', filterCountries);
regionFilter.addEventListener('change', filterCountries);

// --- 4. Modal Interactions for Details ---
function showCountryDetails(country) {
    const flag = country.flags?.svg;
    const name = country.name?.official || country.name?.common;
    const commonName = country.name?.common;
    const capital = country.capital ? country.capital[0] : 'None';
    const languages = country.languages ? Object.values(country.languages).join(', ') : 'N/A';
    const timezones = country.timezones ? country.timezones.slice(0, 2).join(', ') : 'N/A';
    const subregion = country.subregion || 'N/A';
    const historyText = country.history || 'Historical overview incoming soon.';
    
    let currencyStr = 'N/A';
    if (country.currencies) {
        const key = Object.keys(country.currencies)[0];
        currencyStr = `${country.currencies[key].name} (${country.currencies[key].symbol || ''})`;
    }

    // Dynamic Google Maps Embed URL using the country name
    const embedMapUrl = `https://maps.google.com/maps?q=${encodeURIComponent(commonName)}&t=&z=4&ie=UTF8&iwloc=&output=embed`;

    modalBody.innerHTML = `
        <div class="modal-detail-header">
            <img src="${flag}" alt="${commonName} flag" class="modal-flag">
            <div>
                <h2>${name}</h2>
                <p style="margin-top: 0.5rem; color: var(--text-muted);">Region: ${country.region} (${subregion})</p>
            </div>
        </div>
        <hr style="border: 0; border-top: 1px solid var(--text-muted); opacity: 0.3;">
        
        <div class="modal-info-grid">
            <div class="stats-and-history">
                <p><strong><i class="fa-solid fa-city"></i> Capital:</strong> ${capital}</p>
                <p><strong><i class="fa-solid fa-money-bill-wave"></i> Local Currency:</strong> ${currencyStr}</p>
                <p><strong><i class="fa-solid fa-clock"></i> Time Zones:</strong> ${timezones}</p>
                <p><strong><i class="fa-solid fa-language"></i> Languages:</strong> ${languages}</p>
                
                <div class="history-box">
                    <h4><i class="fa-solid fa-landmark"></i> Brief History:</h4>
                    <p>${historyText}</p>
                </div>
            </div>
            
            <div class="map-container">
                <p style="margin-bottom: 0.5rem;"><strong><i class="fa-solid fa-map-location-dot"></i> Interactive Map:</strong></p>
                <iframe 
                    class="embedded-map"
                    src="${embedMapUrl}" 
                    frameborder="0" 
                    scrolling="no" 
                    marginheight="0" 
                    marginwidth="0"
                    allowfullscreen>
                </iframe>
            </div>
        </div>

        <div class="visitor-tip-box">
            <h4><i class="fa-solid fa-lightbulb"></i> Before You Go:</h4>
            <p style="font-size: 0.9rem; margin-top: 0.5rem; color: var(--text-muted);">Ensure your passport has at least 6 months validity. Check local visa rules for your specific nationality regarding stays in ${commonName}.</p>
        </div>
    `;

    countryModal.classList.remove('hidden');
    document.body.style.overflow = 'hidden';
}

// --- Modal Close Button Logic ---
closeModalBtn.addEventListener('click', (e) => {
    e.preventDefault();
    countryModal.classList.add('hidden');
    document.body.style.overflow = 'auto';
});

window.addEventListener('click', (e) => {
    if (e.target === countryModal) {
        countryModal.classList.add('hidden');
        document.body.style.overflow = 'auto';
    }
});

// --- 5. Dark/Light Theme Switcher ---
themeToggle.addEventListener('click', () => {
    const currentTheme = document.body.getAttribute('data-theme');
    if (currentTheme === 'dark') {
        document.body.removeAttribute('data-theme');
        themeToggle.innerHTML = `<i class="fa-solid fa-moon"></i> <span>Dark Mode</span>`;
    } else {
        document.body.setAttribute('data-theme', 'dark');
        themeToggle.innerHTML = `<i class="fa-solid fa-sun"></i> <span>Light Mode</span>`;
    }
});

// Run Init
fetchCountries();