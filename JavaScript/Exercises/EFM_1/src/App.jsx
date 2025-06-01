import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom'
import Evenements from './components/Evenements'
import Expert from './components/Expert'
import Experts1 from './components/Experts1'
import expertsData from './data'
import './App.css'
import Formulaire from './components/Formulaire'
import Fetching from './components/Fetching'

function App() {
  const oneExpert = expertsData[0];

  return (
    <Router>
      <div>
        <nav>
          <ul>
            <li><Link to="/evenements">Evenements</Link></li>
            <li><Link to="/expert">Expert</Link></li>
            <li><Link to="/experts1">Experts1</Link></li>
            <li><Link to="/formulaire">Formulaire</Link></li>
            <li><Link to="/fetching">Fetching</Link></li>
          </ul>
        </nav>

        <Routes>
          <Route path="/evenements" element={<Evenements expertsData={expertsData} />} />
          <Route path="/expert" element={<Expert oneExpert={oneExpert} />} />
          <Route path="/experts1" element={<Experts1 />} />
          <Route path="/formulaire" element={<Formulaire />} />
          <Route path="/fetching" element={<Fetching />} />
        </Routes>
      </div>
    </Router>
  )
}

export default App;