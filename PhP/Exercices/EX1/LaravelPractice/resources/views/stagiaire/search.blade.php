<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Resultat de la recherche</h1>
    <h2>{{$stagiaire->nom}}</h2>
    <h2>{{$stagiaire->prenom}}</h2>
    <h2>{{$stagiaire->age}}</h2>
    <h2>{{$stagiaire->email}}</h2>

    <a href="{{route('list')}}"><button>Retour</button></a>

</body>
</html>
