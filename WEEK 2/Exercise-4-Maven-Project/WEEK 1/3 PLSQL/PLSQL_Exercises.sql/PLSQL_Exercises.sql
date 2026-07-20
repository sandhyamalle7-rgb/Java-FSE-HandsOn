SET SERVEROUTPUT ON;

DECLARE

    salary NUMBER := 60000;

BEGIN

    IF salary >= 80000 THEN

        DBMS_OUTPUT.PUT_LINE('Grade A');

    ELSIF salary >= 50000 THEN

        DBMS_OUTPUT.PUT_LINE('Grade B');

    ELSIF salary >= 30000 THEN

        DBMS_OUTPUT.PUT_LINE('Grade C');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Grade D');

    END IF;

END;
/