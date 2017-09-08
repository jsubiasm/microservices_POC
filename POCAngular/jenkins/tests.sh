echo '--- INICIO tests.sh ---'
cd ./POCAngular
npm install
export CHROME_BIN=/usr/bin/chromium-browser
ng lint --type-check=true
ng test --single-run=true --progress=false
echo '--- FIN tests.sh ---'