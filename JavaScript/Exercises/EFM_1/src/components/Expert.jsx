import React from 'react';

const Expert = ({ oneExpert }) => {
    const Total = oneExpert.événements.reduce((total , event) => total + ((event.durée) * (event.cout_journalier)) , 0)
    return (
        <div>
            <h1 style={{display : 'flex'}}>{oneExpert.nom_complet}</h1>
            <table border={1}>
                <thead>
                    <th>Thème</th>
                    <th>Date Début</th>
                    <th>Date Fin</th>
                    <th>Description</th>
                    <th>Coût Journalier</th>
                    <th>Durée</th>
                    <th>Total</th>
                </thead>
                <tbody>
                    {oneExpert.événements.map((event, eventIndex) => (
                        <tr key={eventIndex}>
                            <td>{event.thème}</td>
                            <td>{event.date_debut}</td>
                            <td>{event.date_fin}</td>
                            <td>{event.description}</td>
                            <td>{event.cout_journalier}</td>
                            <td>{event.durée}</td>
                            <td>{(event.durée) * (event.cout_journalier)}</td>
                        </tr>


                    ))}
                </tbody>
            </table>
            <p>the total is :{Total}</p>


        </div>
    );
}

export default Expert;
