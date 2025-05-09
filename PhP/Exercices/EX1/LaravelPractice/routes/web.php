<?php

use App\Http\Controllers\BaseController;
use App\Http\Controllers\InvokeController;
use App\Http\Controllers\RessourceController;
use App\Http\Controllers\StagiaireController;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
});


Route::get('/indexsss' , [BaseController::class , 'index']);
Route::get('/OneMethode' , [BaseController::class , 'OneMethode']);
Route::get('/invoke' , InvokeController::class);
Route::resource('test', RessourceController::class);


Route::resource('stagiaire', StagiaireController::class);
Route::get('/list', [StagiaireController::class , 'list'])->name('list');
Route::get('/truncate', [StagiaireController::class , 'truncate'])->name('truncate');
Route::get('/search', [StagiaireController::class , 'search'])->name('search');
