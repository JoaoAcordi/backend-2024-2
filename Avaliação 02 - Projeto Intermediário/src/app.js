
const express = require('express');
const bodyParser = require('body-parser');
const locationController = require('./controllers/locationController');

const app = express();

app.use(express.json());

app.get('/', (req, res) => {
    res.send('Bem-vindo ao serviço de localização!');
});

app.post('/coordenadas', locationController.postCoordinates);

app.get('/coordenadas/ultima', locationController.getLastCoordinates);

app.get('/sobre', (req, res) => {
    res.json({
        "estudante": "João Pedro Acordi",
        "projeto": "GeoCoordenadas"
    });
});

