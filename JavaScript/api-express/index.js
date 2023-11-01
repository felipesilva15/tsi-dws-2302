const express = require('express');
const app = express();

let mensagemDoDia = require('./mensagemDoDia');

let data = new Date();

app.get('/', (req, res) => {
    let dia, date, queryDate;

    queryDate = req.query.date ?? '';

    if (queryDate && queryDate.match(/^\d{4}-\d{2}-\d{2}$/)) {
        date = new Date(queryDate + 'T23:01:00.000Z');
        dia = date.getDate();
    } else{
        date = new Date();
        dia = date.getDate();
    }

    let mensagemSelecionada = mensagemDoDia.retornarMensagemDoDia(dia);

    res.json({
        mensagem: mensagemSelecionada,
        data: date.toLocaleDateString()
    });
});

app.listen(8080, () => {
    console.log('Servidor node iniciado em: ' + data);
})