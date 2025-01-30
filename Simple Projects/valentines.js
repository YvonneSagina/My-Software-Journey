function backHearts(){
    let hearts = [];  // Create an array to track the position of hearts
    for (let i = 0; i <= 100; i++) {
        let moyo = document.createElement("div");
        moyo.classList.add("hearts");

        let top = Math.random() * window.innerHeight;
        let left = Math.random() * window.innerWidth;

        // Check if the new position overlaps any existing heart
        while (hearts.some(heart => {
            return Math.abs(top - heart.top) < 60 && Math.abs(left - heart.left) < 60; // Increase this value for larger gaps
        })) {
            top = Math.random() * window.innerHeight;
            left = Math.random() * window.innerWidth;
        }

        hearts.push({top, left});  // Store the new heart's position

        moyo.style.position = "absolute";
        moyo.style.top = top + "px";
        moyo.style.left = left + "px";

        //animate

        document.body.appendChild(moyo);
    }
}

backHearts();
