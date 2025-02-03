function hitungVolume() {
	var tinggi_service = document.getElementById("tinggi_service").value;
	var tinggi_demin = document.getElementById("tinggi_demin").value;

	var jari_service = 6.7; // jari-jari service tank
	var jari_demin = 5; // jari-jari demin tank

	var volume_service = Math.PI * Math.pow(jari_service, 2) * tinggi_service;
	var volume_demin = Math.PI * Math.pow(jari_demin, 2) * tinggi_demin;

	var hasil = "Volume Service Tank: " + volume_service.toFixed(2) + " mm^3<br>Volume Demin Tank: " + volume_demin.toFixed(2) + " mm^3";

	document.getElementById("hasil").innerHTML = hasil;
}


