<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Ajouter un stagiaire</h1>
    <form action="{{route('stagiaire.store')}}" method="post">
        @csrf

        @if ($errors->any())
            <div style="color: red;">
                <ul>
                    @foreach ($errors->all() as $error)
                        <li>{{ $error }}</li>
                    @endforeach
                </ul>
            </div>
        @endif

        <label for="nom">nom:</label>
        <input type="text" name="nom" id="nom" value="{{ old('nom') }}"><br>
        @error('nom')<span style="color: red;">{{ $message }}</span>@enderror<br>

        <label for="prenom">prenom:</label>
        <input type="text" name="prenom" id="prenom" value="{{ old('prenom') }}"><br>
        @error('prenom')<span style="color: red;">{{ $message }}</span>@enderror<br>

        <label for="age">age:</label>
        <input type="number" name="age" id="age" value="{{ old('age') }}"><br>
        @error('age')<span style="color: red;">{{ $message }}</span>@enderror<br>

        <label for="email">email:</label>
        <input type="email" name="email" id="email" value="{{ old('email') }}"><br>
        @error('email')<span style="color: red;">{{ $message }}</span>@enderror<br>
        <button type="submit">Ajouter</button>
    </form>
</body>
</html>
