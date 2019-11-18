import {createStore,applyMiddleware,compose} from 'redux';
import {rootReducer} from './reducer';
import redexImmutableStrateInvariant from 'redux-immutable-state-invariant'

export default function configureStore(initialState){
    const composeEnhancer=window._Redux_DevTools_
    return createStore(rootReducer,initialState,applyMiddleWare(reduxImmutableStateInvariant()))
}
