<?php

namespace App\Http\Controllers;

use App\Http\Requests\StoreStagiaireRequest;
use App\Http\Requests\UpdateStagiaireRequest;
use App\Models\Stagiaire;
use Illuminate\Http\Request;

class StagiaireController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        //$stagiaires = Stagiaire::all();
        return view('stagiaire.index');
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('stagiaire.ajouter');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(StoreStagiaireRequest $request)
    {
        Stagiaire::create([
            'nom' => $request->nom,
            'prenom' => $request->prenom,
            'age' => $request->age,
            'email' => $request->email,
        ]);
        return redirect()->route('list')->with('success', 'Stagiaire ajouté avec succès');
    }

    /**
     * Display the specified resource.
     */
    public function show(Stagiaire $stagiaire) {
        return view('stagiaire.show', compact('stagiaire'));

    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Stagiaire $stagiaire)
    {
        return view('stagiaire.modifier', compact('stagiaire'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(UpdateStagiaireRequest $request, Stagiaire $stagiaire)
    {

        $validated = $request->validated();

        $stagiaire->update($validated);
        return redirect()->route('list')->with('success', 'Stagiaire modifier avec succès');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Stagiaire $stagiaire)
    {
        $stagiaire->delete();
        return redirect()->route('list')->with('success', 'Stagiaire supprimer avec succès');
    }

     public function truncate(Stagiaire $stagiaire)
    {
        Stagiaire::truncate();
        return redirect()->route('list')->with('success', 'tous les Stagiaires supprimer avec succès');
    }

     public function search(Request $request)
    {
        $search = $request->search;
        $stagiaire = Stagiaire::where('nom',$search )->first();


        return view('stagiaire.search', compact('stagiaire'));
    }

    public function list()
    {
        $stagiaires = Stagiaire::all();
        return view('stagiaire.list', compact('stagiaires'));
    }
}
