export default function courseReducer(state=[],action){
    switch(action.type){
        case "CREATE_COURSE":
         // debugger;
          //  state.push(action.course) //This mutates the state
          return [...state, {...action.course}] //immutability
        default:
            return state  
    }
}