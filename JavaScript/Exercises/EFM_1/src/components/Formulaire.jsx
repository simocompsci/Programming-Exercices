import React, { useState } from 'react';

const Formulaire = () => {
    const [FormData, setFormData] = useState({
        theme: '',
        date_debut: '',
        date_fin: '',
        cout: '',
        expert: ''

    });
    const [showResult, setShowResult] = useState(false);
    const handleSubmit = (e) => {
        e.preventDefault();
        setShowResult(true)
    }
    return (
        <div>
            <fieldset>
                <legend>Formulaire</legend>
                <form onSubmit={handleSubmit}>
                    <label htmlFor="">theme</label><br />
                    <input type="text" onChange={(e) => setFormData({ ...FormData, theme: e.target.value })} /><br />
                    <label htmlFor="">date debut</label><br />
                    <input type="date" onChange={(e) => setFormData({ ...FormData, date_debut: e.target.value })} /><br />
                    <label htmlFor="">date fin</label><br />
                    <input type="date" onChange={(e) => setFormData({ ...FormData, date_fin: e.target.value })} /><br />
                    <label htmlFor="">cout</label><br /><br />
                    <input type="text" onChange={(e) => setFormData({ ...FormData, cout: e.target.value })} /><br />
                    <label htmlFor="">expert</label><br />
                    <input type="text" onChange={(e) => setFormData({ ...FormData, expert: e.target.value })} /><br />


                    <button type='submit'>Confirmer</button>

                </form>
            </fieldset>


            {showResult && (
                <div>
                    <p>L'expert :{FormData.expert} assura le theme {FormData.theme}
                        avec un cout journalier {FormData.cout} pour une durée
                        de {(FormData.date_fin - FormData.date_debut)}jrs
                    </p>
                </div>
            )}

        </div>
    );
}

export default Formulaire;































