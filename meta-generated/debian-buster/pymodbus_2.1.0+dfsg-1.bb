PACKAGES = "${PN} python-pymodbus"
PROVIDES = "python-pymodbus"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pymodbus/python-pymodbus_2.1.0+dfsg-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-pymodbus = "python-pymodbus_2.1.0+dfsg-1_all.deb"
SRC_URI[deb0.sha256sum] = "e902daa21865657923df645cfdfa5352a7c1a17c8ffcaece2b44dcb84219c4e0"
SRC_URI[deb0.md5sum] = "6b883fcb7a0cce81107a4e7349a93388"

RDEPENDS_python-${PN} = "python (<< 2.8) python (>= 2.7~) python-serial python-six (>= 1.11.0)"
DEPENDS = "python python-serial python-six"


inherit deb_group

FILES_python-pymodbus = " \
    ./usr/lib/python2.7/dist-packages/ez_setup.py \
    ./usr/lib/python2.7/dist-packages/pymodbus-2.1.0.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/pymodbus-2.1.0.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/pymodbus-2.1.0.egg-info/entry_points.txt \
    ./usr/lib/python2.7/dist-packages/pymodbus-2.1.0.egg-info/requires.txt \
    ./usr/lib/python2.7/dist-packages/pymodbus-2.1.0.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/pymodbus-2.1.0.egg-info/zip-safe \
    ./usr/lib/python2.7/dist-packages/pymodbus/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/bit_read_message.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/bit_write_message.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/deprecated/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/deprecated/asynchronous.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/factory/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/factory/serial.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/factory/tcp.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/factory/udp.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/mixins.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/schedulers/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/serial.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/tcp.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/thread.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/tornado/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/twisted/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/asynchronous/udp.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/common.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/client/sync.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/compat.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/constants.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/datastore/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/datastore/context.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/datastore/database/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/datastore/database/redis_datastore.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/datastore/database/sql_datastore.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/datastore/remote.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/datastore/store.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/device.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/diag_message.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/events.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/exceptions.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/factory.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/file_message.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/framer/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/framer/ascii_framer.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/framer/binary_framer.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/framer/rtu_framer.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/framer/socket_framer.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/interfaces.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/internal/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/internal/ptwisted.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/mei_message.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/other_message.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/payload.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/pdu.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/register_read_message.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/register_write_message.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/repl/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/repl/client.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/repl/completer.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/repl/helper.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/repl/main.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/server/__init__.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/server/asynchronous.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/server/sync.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/transaction.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/utilities.py \
    ./usr/lib/python2.7/dist-packages/pymodbus/version.py \
    ./usr/share/doc/python-pymodbus/changelog.Debian.gz \
    ./usr/share/doc/python-pymodbus/changelog.gz \
    ./usr/share/doc/python-pymodbus/copyright\
"
