const display = document.getElementById("display");

// Grab audio elements
const clickSound = document.getElementById("click-sound");
const clearSound = document.getElementById("clear-sound");
const successSound = document.getElementById("success-sound");
const errorSound = document.getElementById("error-sound");

function appendValue(value) {
    // Play sound immediately on click
    if (clickSound) {
        clickSound.currentTime = 0; 
        clickSound.play().catch(err => console.log("Audio waiting for user gesture:", err));
    }
    display.value += value;
}

function clearDisplay() {
    // Play magical broom swoosh sound
    if (clearSound) {
        clearSound.currentTime = 0;
        clearSound.play().catch(err => console.log("Audio waiting for user gesture:", err));
    }
    display.value = "";
}

function calculate() {
    try {
        const result = eval(display.value);
        
        if (result !== undefined && !isNaN(result)) {
            display.value = result;
            
            // Play success chime sound
            if (successSound) {
                successSound.currentTime = 0;
                successSound.play().catch(err => console.log("Audio waiting for user gesture:", err));
            }

            // Trigger celebration animation on display box
            display.classList.add("happy-shake");
            setTimeout(() => {
                display.classList.remove("happy-shake");
            }, 400);
        }
    } catch {
        // Play funny error sound
        if (errorSound) {
            errorSound.currentTime = 0;
            errorSound.play().catch(err => console.log("Audio waiting for user gesture:", err));
        }
        display.value = "Oops!";
    }
}