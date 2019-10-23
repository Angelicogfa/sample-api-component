# use MSSQL 2017 image on Ubuntu 16.04
FROM mcr.microsoft.com/mssql/server:2017-latest

# create directory within SQL container for database files
RUN mkdir -p /opt/mssql-scripts

# copy the database files from host to container
COPY ./setup.sql /opt/mssql-scripts

# set environment variables
ENV MSSQL_SA_PASSWORD=P@ssw0rd1!
ENV ACCEPT_EULA=Y

# run initial scripts
RUN ( /opt/mssql/bin/sqlservr --accept-eula & ) | grep -q "Service Broker manager has started" \
    && /opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P 'P@ssw0rd1!' -i /opt/mssql-scripts/setup.sql \
    && pkill sqlservr 