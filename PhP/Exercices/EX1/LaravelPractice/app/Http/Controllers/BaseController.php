<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class BaseController extends Controller
{

    /*public function __construct()
    {
        $this->middleware(['middleware1', 'middleware2', 'middleware3']);
        $this->middleware('middleware1')->only('OneMethode');
        $this->middleware('middleware2')->except('OneMethode');
        $this->middleware('middleware3')->except(['OneMethode' , ]);
    }*/
    
    public function index()
    {
        return 'je suis le Controlleur de base';
    }

    public function OneMethode()
    {
        return view('welcome');
    }
}
