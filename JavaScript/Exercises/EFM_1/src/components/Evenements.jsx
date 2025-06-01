import React from 'react';
import expertsData from '../data';


const Evenements = ({ expertsData }) => {
    console.log(expertsData);
    const allEvents = expertsData.flatMap(expert => expert.événements);
    const TotalEvents = allEvents.reduce((Total , event)  => Total +((event.durée)* (event.cout_journalier)) , 0);
    return (
        <>
            <h1>Evenements</h1>
            <table border={1}>
                <thead>
                    <tr>
                        <th>Thème</th>
                        <th>Date Début</th>
                        <th>Date Fin</th>
                        <th>Description</th>
                        <th>Coût Journalier</th>
                        <th>Durée</th>
                        <th>Total</th>
                    </tr>
                </thead>
                <tbody>
                    {expertsData.map((expert) =>
                        expert.événements.map((event, eventIndex) => (
                            <tr key={`${expert.id}-${eventIndex}`}>
                                <td>{event.thème}</td>
                                <td>{event.date_debut}</td>
                                <td>{event.date_fin}</td>
                                <td>{event.description}</td>
                                <td>{event.cout_journalier}</td>
                                <td>{event.durée}</td>
                                <td>{(event.durée)* (event.cout_journalier)}</td>
                            </tr>
                        ))
                    )}
                   
                </tbody>
            </table>
            <p>Total des couts des Evenements :{TotalEvents}</p>


        </>

    );
}

export default Evenements;
