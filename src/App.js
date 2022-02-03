
import Navbar from './Navbar';
import Directory from './Directory';

function App() {
  const title = 'IRVING LOPEZ PHOTOGRAPHY'
  const city = 'OMAHA'
  return (
    <div className="App">
      <Navbar />
      <div className="content">
          <h1>{ title }</h1>
          <h2>{ city }</h2>
      </div>
      <div>
        <Directory />
      </div>
    </div>
  );
}

export default App;
