<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>

    <h1>Welcom to you management app</h1>
    <nav>
        <a href="{{route('list')}}">lister tous Stagiaire</a>
        <a href="{{route('stagiaire.create')}}">ajouter Stagiaire</a>
        <a href="{{route('truncate')}}">supprimer tous</a>
        <div>
            <form action="{{route('search')}}" method="get">
                @csrf
                <label for="">Rechercher</label>
                <input type="text" name="search">
                <button type="submit">Rechercher</button>
            </form>

        </div>

    </nav>


</body>

</html>
