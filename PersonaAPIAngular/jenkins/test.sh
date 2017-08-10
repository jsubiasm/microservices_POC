#!/bin/bash
####################################
#
# Script para ejecucion de tests
#
####################################

# Instalamos dependencias. 
npm install

# Lanzamos tests.
ng test --single-run
