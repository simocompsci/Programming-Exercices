import React from 'react';
import expertsData from '../data';
import Expert from './Expert';

const Experts1 = () => {

    return (
        <div>
            <ul>
                {expertsData.map((expert)=> (
                    <li key={expert.id}>
                        <h2>{expert.nom_complet}</h2>
                        <div>
                            <Expert oneExpert={expert}/>
                        </div>
                    </li>

            ))}

            </ul>
            
            
        </div>
    );
}

export default Experts1;
