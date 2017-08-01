import { PersonaAPIAngularPage } from './app.po';

describe('PersonaAPIAngular App', function() {
  let page: PersonaAPIAngularPage;

  beforeEach(() => {
    page = new PersonaAPIAngularPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Prueba Concepto API RESTful');
  });
});
