import { HolaMundoAPI03AngularPage } from './app.po';

describe('holamundoapi03angular App', function() {
  let page: HolaMundoAPI03AngularPage;

  beforeEach(() => {
    page = new HolaMundoAPI03AngularPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
