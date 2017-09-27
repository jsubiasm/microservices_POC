// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.

export const environment = {
    production: false,
    entorno: 'Pruebas',
    personasApiDefaultPath: 'http://192.168.56.101:10008/v1',
    gitHub: 'https://github.com/jsubiasm/microservices_POC',
    swaggerEditor: 'https://editor.swagger.io',
    jenkins: 'http://192.168.56.101:8080',
    eureka: 'http://192.168.56.101:10013',
    bootAdmin: 'http://192.168.56.101:10012',
    zipkin: 'http://192.168.56.101:10014',
    hystrix: 'http://192.168.56.101:10015/hystrix/monitor?stream=http%3A%2F%2F192.168.56.101%3A10015%2Fturbine.stream%3Fcluster%3DZUUL',    
};
