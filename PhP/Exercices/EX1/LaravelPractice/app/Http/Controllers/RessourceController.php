<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class RessourceController extends Controller
{

   
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return "je suis le controlleur de resources";
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return "je suis la methode create  de resources";
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        return "je suis la methode show du  controlleur de resources" . $id;
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        return "je suis la methode edit du  controlleur de resources" . $id;
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {

    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }
}
