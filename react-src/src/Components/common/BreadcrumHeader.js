import React from 'react'
import { Breadcrumb } from 'react-bootstrap'

const BreadcrumHeader = ({headerList}) => {

    return (
        <div>
            <Breadcrumb>
                {
                    Object.keys(headerList).map((index, value, array) => {
                        return (
                            <Breadcrumb.Item href={headerList[index].link}>{headerList[index].heading}</Breadcrumb.Item>
                        )
                    })
                }
                <Breadcrumb.Item href="#">Home</Breadcrumb.Item>
                <Breadcrumb.Item active>Data</Breadcrumb.Item>
            </Breadcrumb>
        </div>
    )
}

export default BreadcrumHeader