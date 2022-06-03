import {Alert, Grid} from "@mui/material";
import React from "react";


export default function Success({message}) {
    return (
        <Grid>
            <Alert variant="filled" severity="success">
                {message || "the repository has been successfully created"}
            </Alert>
        </Grid>
    );
}