const barCanvas = document.getElementById
("barCanvas");

const barChart = new Chart(barCanvas, {
	type: "bar",
	date : {
		labels : ["beijing", "Tokyo", "Seoul", "Hong Kong"],
		datasets : [{
			data:[240,120,140,130]
		}]
		
	}
})