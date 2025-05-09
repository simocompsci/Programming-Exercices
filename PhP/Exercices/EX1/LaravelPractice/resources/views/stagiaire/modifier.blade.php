<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Modifier un stagiaire</h1>
    <form action="{{route('stagiaire.update', $stagiaire->id)}}" method="post">
        @csrf
        @method('PUT')
        <label for="">nom:</label>
        <input type="text" name="nom" value="{{$stagiaire->nom}}"><br>
        <label for="">prenom:</label>
        <input type="text" name="prenom" value="{{$stagiaire->prenom}}"><br>
        <label for="">age:</label>
        <input type="number" name="age" value="{{$stagiaire->age}}"><br>
        <label for="email">email:</label>
        <input type="email" name="email" id="email" value="{{$stagiaire->email }}"><br>
        <button type="submit">Modifier</button>



    </form>
</body>
</html>
