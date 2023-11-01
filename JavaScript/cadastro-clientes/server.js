// Importando os módulos http, fs (sistema de arquivos) e path (caminhos de arquivo)
const http = require("http");
const fs = require("fs");
const path = require("path");

// Definindo o hostname (endereço IP) e porta do servidor
const hostname = "127.0.0.1";
const port = 3000;

// Criando um servidor HTTP usando o módulo http
const server = http.createServer((req, res) => {
    // Verificando se a URL da requisição é "/form" e o método é GET
    if (req.url === '/form' && req.method === 'GET') {
        // Construindo o caminho completo para o arquivo form.html
        const filePath = path.join(__dirname, 'form.html');

        // Lendo o conteúdo do arquivo form.html
        fs.readFile(filePath, 'utf8', (err, data) => {
            // Se houver um erro na leitura do arquivo, retorna um status 500 (Erro interno do servidor)
            if (err) {
                res.statusCode = 500;
                res.end('Erro interno do servidor');
            } else {
                // Se a leitura do arquivo for bem-sucedida, retorna o conteúdo do arquivo com status 200 (OK)
                res.statusCode = 200;
                res.setHeader('Content-Type', 'text/html');
                res.end(data);
            }
        });
    } else if(req.url === '/cadastrar' && req.method === 'POST') {
        res.statusCode = 200;
        res.setHeader('Content-Type', 'text/plain');
        res.end('Cliente cadastrado!');
    } else {
        // Se a URL não for "/form" ou o método não for GET, retorna um status 404 (Página não encontrada)
        res.statusCode = 404;
        res.setHeader('Content-Type', 'text/plain');
        res.end('Página não encontrada');
    }
});

// Ouvindo o servidor no hostname e porta especificados

server.listen(port, hostname, () => {
    console.log(`Servidor em execução em http://${hostname}:${port}/`);
});
