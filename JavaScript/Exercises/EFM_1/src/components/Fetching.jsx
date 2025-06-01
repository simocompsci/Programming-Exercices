import React, { useEffect, useState } from 'react';

const Fetching = () => {
    const [experetsData, setExpertsData] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    const allEvents = experetsData.flatMap(expert => expert.événements);
    const TotalEvents = allEvents.reduce((Total , event)  => Total +((event.durée)* (event.cout_journalier)) , 0);

    useEffect(() => {
        fetch('/data/expertsData.json')
            .then((response) => {
                if (!response.ok) {
                    throw new Error('Failed to fetch data');
                }
                return response.json();
            })
            .then((data) => {
                setExpertsData(data);
                console.log(experetsData);
                setLoading(false);
            })
            .catch((err) => {
                setError(err.message);
                setLoading(false);
            });
    }, []);
    return (
        <div>
            <h1>hello</h1>
            <ul>
                {experetsData.map((expert) => (
                    <li key={expert.id}>
                        <h2>{expert.nom_complet}</h2>
                        <div>
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
                                    {expert.événements.map((event, eventIndex) => (
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
                            <p>the total is :{TotalEvents}</p>
                        </div>
                    </li>
                ))}
            </ul>

        </div>
    );
}

export default Fetching;
