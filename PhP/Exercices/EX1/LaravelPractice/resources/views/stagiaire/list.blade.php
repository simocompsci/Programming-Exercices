<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <table border="1">
        <tr>
            <td>nom</td>
            <td>prenom</td>
            <td>age</td>
            <td>email</td>
            <td>actions</td>
        </tr>

        @foreach($stagiaires as $stagiaire)
        <tr>
            <td>{{$stagiaire->nom}}</td>
            <td>{{$stagiaire->prenom}}</td>
            <td>{{$stagiaire->age}}</td>
            <td>{{$stagiaire->email}}</td>
            <td>
                <a href="{{route('stagiaire.show',$stagiaire->id)}}">details</a>
                <a href="{{route('stagiaire.edit',$stagiaire->id)}}">modifier</a>
                <form action="{{route('stagiaire.destroy',$stagiaire->id)}}" method="post">
                    @csrf
                    @method('delete')
                    <button type="submit">supprimer</button>
                </form>
            </td>
        </tr>
        @endforeach

    </table>
    <a href="{{route('stagiaire.index')}}"><button>Retour</button></a>
</body>

</html>
