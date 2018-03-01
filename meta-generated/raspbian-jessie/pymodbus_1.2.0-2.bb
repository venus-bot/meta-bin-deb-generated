PACKAGES = "python-pymodbus"
PROVIDES = "python-pymodbus"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pymodbus/python-pymodbus_1.2.0-2_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-pymodbus = "python-pymodbus_1.2.0-2_all.deb"
SRC_URI[deb0.sha256sum] = "88b8ae7403ac67900a012d68cd64f85609d06f3985870fd6fe61c5d81143bbd9"
SRC_URI[deb0.md5sum] = "25bce30dc05d429c13ee593ade79225e"

RDEPENDS_python-${PN} = "python (>= 2.6.6-7~) python (<< 2.8)"
DEPENDS = "python"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-pymodbus = " \
	./usr/lib/python2.6/dist-packages/pymodbus/file_message.py \
	./usr/share/pyshared/pymodbus/register_write_message.py \
	./usr/lib/python2.6/dist-packages/ez_setup.py \
	./usr/lib/python2.7/dist-packages/pymodbus/register_write_message.py \
	./usr/share/pyshared/pymodbus/file_message.py \
	./usr/share/pyshared/pymodbus/client/async.py \
	./usr/lib/python2.7/dist-packages/pymodbus/pdu.py \
	./usr/share/pyshared/pymodbus/internal/ptwisted.py \
	./usr/share/pyshared/pymodbus-1.2.0.egg-info/dependency_links.txt \
	./usr/lib/python2.7/dist-packages/pymodbus/datastore/remote.py \
	./usr/lib/python2.7/dist-packages/pymodbus/constants.py \
	./usr/share/pyshared/pymodbus-1.2.0.egg-info/top_level.txt \
	./usr/share/pyshared/pymodbus/client/sync.py \
	./usr/lib/python2.6/dist-packages/pymodbus/register_write_message.py \
	./usr/lib/python2.6/dist-packages/pymodbus/server/async.py \
	./usr/lib/python2.6/dist-packages/pymodbus/datastore/context.py \
	./usr/lib/python2.7/dist-packages/pymodbus/register_read_message.py \
	./usr/lib/python2.7/dist-packages/pymodbus/server/sync.py \
	./usr/share/pyshared/pymodbus-1.2.0.egg-info/requires.txt \
	./usr/lib/python2.7/dist-packages/pymodbus/client/common.py \
	./usr/lib/python2.6/dist-packages/pymodbus/diag_message.py \
	./usr/lib/python2.6/dist-packages/pymodbus/transaction.py \
	./usr/share/pyshared/pymodbus/__init__.py \
	./usr/share/pyshared/pymodbus/datastore/remote.py \
	./usr/lib/python2.7/dist-packages/pymodbus-1.2.0.egg-info/zip-safe \
	./usr/lib/python2.6/dist-packages/pymodbus/other_message.py \
	./usr/lib/python2.6/dist-packages/pymodbus/client/common.py \
	./usr/lib/python2.7/dist-packages/pymodbus/diag_message.py \
	./usr/lib/python2.6/dist-packages/pymodbus/client/async.py \
	./usr/lib/python2.7/dist-packages/pymodbus/mei_message.py \
	./usr/share/pyshared/pymodbus/bit_write_message.py \
	./usr/lib/python2.7/dist-packages/pymodbus/client/__init__.py \
	./usr/share/pyshared/pymodbus/datastore/context.py \
	./usr/share/doc/python-pymodbus/changelog.Debian.gz \
	./usr/share/pyshared/ez_setup.py \
	./usr/lib/python2.6/dist-packages/pymodbus/client/__init__.py \
	./usr/lib/python2.7/dist-packages/pymodbus/bit_read_message.py \
	./usr/lib/python2.7/dist-packages/pymodbus/device.py \
	./usr/lib/python2.7/dist-packages/pymodbus-1.2.0.egg-info/requires.txt \
	./usr/share/pyshared/pymodbus/server/sync.py \
	./usr/lib/python2.7/dist-packages/pymodbus/server/__init__.py \
	./usr/share/pyshared/pymodbus/device.py \
	./usr/share/pyshared/pymodbus/payload.py \
	./usr/share/pyshared/pymodbus/other_message.py \
	./usr/share/pyshared/pymodbus/factory.py \
	./usr/lib/python2.6/dist-packages/pymodbus/datastore/remote.py \
	./usr/lib/python2.6/dist-packages/pymodbus/version.py \
	./usr/share/doc/python-pymodbus/copyright \
	./usr/share/pyshared/pymodbus/datastore/store.py \
	./usr/lib/python2.7/dist-packages/pymodbus/bit_write_message.py \
	./usr/lib/python2.7/dist-packages/pymodbus/client/async.py \
	./usr/lib/python2.7/dist-packages/pymodbus/other_message.py \
	./usr/lib/python2.6/dist-packages/pymodbus/exceptions.py \
	./usr/share/pyshared/pymodbus/datastore/__init__.py \
	./usr/lib/python2.6/dist-packages/pymodbus/server/__init__.py \
	./usr/lib/python2.6/dist-packages/pymodbus/internal/ptwisted.py \
	./usr/lib/python2.7/dist-packages/pymodbus/client/sync.py \
	./usr/share/pyshared/pymodbus/pdu.py \
	./usr/lib/python2.6/dist-packages/pymodbus-1.2.0.egg-info/top_level.txt \
	./usr/lib/python2.7/dist-packages/pymodbus/events.py \
	./usr/lib/python2.7/dist-packages/pymodbus/datastore/__init__.py \
	./usr/lib/python2.6/dist-packages/pymodbus/constants.py \
	./usr/share/pyshared/pymodbus/interfaces.py \
	./usr/lib/python2.7/dist-packages/pymodbus-1.2.0.egg-info/top_level.txt \
	./usr/lib/python2.6/dist-packages/pymodbus-1.2.0.egg-info/requires.txt \
	./usr/lib/python2.6/dist-packages/pymodbus/datastore/__init__.py \
	./usr/share/pyshared/pymodbus/version.py \
	./usr/share/pyshared/pymodbus/exceptions.py \
	./usr/share/pyshared/pymodbus/mei_message.py \
	./usr/lib/python2.7/dist-packages/pymodbus/file_message.py \
	./usr/lib/python2.7/dist-packages/pymodbus/internal/ptwisted.py \
	./usr/lib/python2.6/dist-packages/pymodbus/internal/__init__.py \
	./usr/lib/python2.7/dist-packages/pymodbus/factory.py \
	./usr/lib/python2.6/dist-packages/pymodbus/interfaces.py \
	./usr/lib/python2.6/dist-packages/pymodbus/__init__.py \
	./usr/lib/python2.6/dist-packages/pymodbus/server/sync.py \
	./usr/lib/python2.7/dist-packages/pymodbus/datastore/context.py \
	./usr/lib/python2.7/dist-packages/pymodbus/server/async.py \
	./usr/lib/python2.6/dist-packages/pymodbus/utilities.py \
	./usr/share/pyshared/pymodbus-1.2.0.egg-info/SOURCES.txt \
	./usr/share/pyshared/pymodbus/client/__init__.py \
	./usr/share/pyshared/pymodbus/bit_read_message.py \
	./usr/lib/python2.6/dist-packages/pymodbus-1.2.0.egg-info/dependency_links.txt \
	./usr/lib/python2.7/dist-packages/pymodbus/transaction.py \
	./usr/lib/python2.7/dist-packages/pymodbus/__init__.py \
	./usr/lib/python2.6/dist-packages/pymodbus-1.2.0.egg-info/SOURCES.txt \
	./usr/lib/python2.6/dist-packages/pymodbus/payload.py \
	./usr/lib/python2.7/dist-packages/pymodbus-1.2.0.egg-info/dependency_links.txt \
	./usr/lib/python2.7/dist-packages/pymodbus/internal/__init__.py \
	./usr/lib/python2.6/dist-packages/pymodbus/factory.py \
	./usr/share/pyshared/pymodbus/register_read_message.py \
	./usr/share/pyshared/pymodbus/utilities.py \
	./usr/share/pyshared/pymodbus/client/common.py \
	./usr/lib/python2.6/dist-packages/pymodbus/bit_write_message.py \
	./usr/share/pyshared/pymodbus-1.2.0.egg-info/PKG-INFO \
	./usr/share/pyshared/pymodbus/events.py \
	./usr/share/pyshared/pymodbus/diag_message.py \
	./usr/lib/python2.7/dist-packages/pymodbus-1.2.0.egg-info/SOURCES.txt \
	./usr/lib/python2.7/dist-packages/pymodbus-1.2.0.egg-info/PKG-INFO \
	./usr/lib/python2.7/dist-packages/ez_setup.py \
	./usr/share/pyshared/pymodbus/internal/__init__.py \
	./usr/lib/python2.6/dist-packages/pymodbus/device.py \
	./usr/share/pyshared/pymodbus/server/async.py \
	./usr/lib/python2.6/dist-packages/pymodbus/pdu.py \
	./usr/lib/python2.6/dist-packages/pymodbus/client/sync.py \
	./usr/lib/python2.7/dist-packages/pymodbus/payload.py \
	./usr/lib/python2.7/dist-packages/pymodbus/utilities.py \
	./usr/share/pyshared/pymodbus/server/__init__.py \
	./usr/lib/python2.6/dist-packages/pymodbus/mei_message.py \
	./usr/share/pyshared/pymodbus/transaction.py \
	./usr/lib/python2.7/dist-packages/pymodbus/datastore/store.py \
	./usr/lib/python2.7/dist-packages/pymodbus/interfaces.py \
	./usr/lib/python2.6/dist-packages/pymodbus/bit_read_message.py \
	./usr/lib/python2.7/dist-packages/pymodbus/exceptions.py \
	./usr/lib/python2.6/dist-packages/pymodbus/events.py \
	./usr/lib/python2.6/dist-packages/pymodbus-1.2.0.egg-info/PKG-INFO \
	./usr/lib/python2.7/dist-packages/pymodbus/version.py \
	./usr/lib/python2.6/dist-packages/pymodbus-1.2.0.egg-info/zip-safe \
	./usr/share/pyshared/pymodbus/constants.py \
	./usr/share/pyshared/pymodbus-1.2.0.egg-info/zip-safe \
	./usr/lib/python2.6/dist-packages/pymodbus/register_read_message.py \
	./usr/lib/python2.6/dist-packages/pymodbus/datastore/store.py\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
