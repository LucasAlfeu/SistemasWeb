var map = L.map('map').setView([-22.760636, -43.6887633], 13);

L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '<a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);

L.marker([-22.761286055192592, -43.686665969258875]).addTo(map) 

var control = L.Routing.control({
    waypoints: [
        L.latLng(-22.761286055192592, -43.686665969258875), //coordenadas de inicio
		L.latLng(-22.744147850042292, -43.706914856870966), // Ponto intermediário 1
		L.latLng(-22.739265245224374, -43.69485119063112), // Ponto intermediário 2
        L.latLng(-22.745821239306117, -43.69752153261173)  // coordenadas do fim
    ],
	show: false,
	routeWhileDragging: true,
	showAlternatives: true, // Habilita rotas alternativas
	altLineOptions: {
	    styles: [
	        { color: 'green', opacity: 0.7, weight: 7 }, // Estilo da rota alternativa
	        { color: 'black', opacity: 0.5, weight: 5 }
	    ]
	}
    
}).addTo(map);

// Captura o evento 'routesfound' para obter informações sobre a rota
control.on('routesfound', function(e) {
    var routes = e.routes;
    var summary = routes[0].summary; // Primeira rota
    var distance = summary.totalDistance; // Distância total em metros
    var time = summary.totalTime; // Tempo total em segundos
    
    console.log('Distância total: ' + (distance / 1000).toFixed(2) + ' km');
    console.log('Tempo estimado: ' + (time / 60).toFixed(2) + ' minutos');
});