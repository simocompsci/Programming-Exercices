<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Stagiaire extends Model
{
    /** @use HasFactory<\Database\Factories\StagiaireFactory> */
    use HasFactory;

    protected $fillable = [
        'nom',
        'prenom',
        'age',
        'email',
        'password',

    ];
}
