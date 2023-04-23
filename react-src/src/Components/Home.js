import React from 'react'
import Header from './common/Header';
import Footer from './common/Footer';
import BreadcrumHeader from './common/BreadcrumHeader';

const Home = () => {
    
    const headerList = {
        0 : {
            header: "Home",
            link: "www.google.com"
        },
        1 : {
            header: "loginPage",
            link: "www.google.com"
        }
    }
    
    return (
        <>

            <Header />
            <BreadcrumHeader
                headerList={headerList}
            />
            body
            <Footer />

        
        </>
    )
}

export default Home;