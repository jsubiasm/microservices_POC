import { browser, element, by } from 'protractor';

export class HolaMundoAPI03AngularPage {
  navigateTo() {
    return browser.get('/');
  }

  getParagraphText() {
    return element(by.css('app-root h1')).getText();
  }
}
