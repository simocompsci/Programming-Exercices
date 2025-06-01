import Evenements from './components/Evenements'
import Expert from './components/Expert'
import Experts1 from './components/Experts1'
import expertsData from './data'
import './App.css'
import Formulaire from './components/Formulaire'

function App() {
  const oneExpert = expertsData[0];
  return (
    <>
      <Evenements expertsData={expertsData}/>
      <Expert oneExpert={oneExpert}/>
      <Experts1/>
      <Formulaire/>

    </>
  )
}

export default App
