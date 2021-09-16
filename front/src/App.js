import React, { useContext, useReducer, useEffect, useRef, useState, createContext } from 'react';

const HOST_API = "http://localhost:8080/api";

function App() {
  return <StoreProvider>
    <h3>To-Do List</h3>
    <Form />
    <List />
  </StoreProvider>
}

export default App;
