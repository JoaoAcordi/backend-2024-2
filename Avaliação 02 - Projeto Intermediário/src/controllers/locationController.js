let coordenadas = [];

function convertToDMS(lat, lon) {
    const convert = (decimal) => {
        const degrees = Math.floor(decimal);
        const minutes = Math.floor((decimal - degrees) * 60);
        const seconds = ((decimal - degrees - minutes / 60) * 3600).toFixed(2);
        return { degrees, minutes, seconds };
    };

    return {
        lat: convert(lat),
        lon: convert(lon)
    };
}

exports.postCoordinates = (req, res) => {
    const { lat, lon } = req.body;

    if (typeof lat !== 'number' || typeof lon !== 'number') {
        return res.status(400).json({ error: 'Coordenadas inválidas. Certifique-se de enviar números.' });
    }

    coordenadas.push({ lat, lon });

    const result = convertToDMS(lat, lon);
    res.json({
        message: 'Conversão bem-sucedida',
        coordinates: result
    });
};

exports.getLastCoordinates = (req, res) => {
    if (coordenadas.length === 0) {
        return res.status(404).json({ message: 'Nenhuma coordenada encontrada.' });
    }

    const lastCoordinates = coordenadas[coordenadas.length - 1];
    res.json(lastCoordinates);
};
