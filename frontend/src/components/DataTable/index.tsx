import axios from "axios";
import Pagination from "components/Pagination";
import { useEffect } from "react";
import { useState } from "react";
import { SalePage } from "types/sale";
import { formatLocalDate } from "utils/format";
import { BASE_URL } from "utils/requests";

const DataTable = () => {

    const [activePage, setActivePage] = useState(0);

    const [page, setPage] = useState<SalePage>({
        first: true,
        last: true,
        number: 0,
        numberOfElements: 0,
        totalPages: 0
    });

    //faz a chamanda apenas quando a pagina carregar
    useEffect(() => {
        axios.get(`${BASE_URL}/sales?page=${activePage}&size=20&sort=date,desc`)
            .then(resposta => {
                setPage(resposta.data)
            });
    }, [activePage]);

    const changePage = (index:number) => {
        setActivePage(index);
    }

    return (
        <>
            <Pagination page={page} onPageChange={changePage} />
            <div className="table-responsive">

                <table className="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>Data</th>
                            <th>Vendedor</th>
                            <th>Clientes visitados</th>
                            <th>Negócios fechados</th>
                            <th>Valor</th>
                        </tr>
                    </thead>
                    <tbody>
                        {page.content?.map(item => (
                            <tr key={item.id}>
                                <th>{formatLocalDate(item.date, "dd/MM/yyyy")}</th>
                                <th>{item.seller.name}</th>
                                <th>{item.visited}</th>
                                <th>{item.deals}</th>
                                <th>{item.amount.toFixed(2)}</th>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </>
    );
}

export default DataTable;
