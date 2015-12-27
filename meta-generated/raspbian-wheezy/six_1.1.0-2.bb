PACKAGES = "python-six"
PROVIDES = "python-six"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/six/python-six_1.1.0-2_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-six = "python-six_1.1.0-2_all.deb"
SRC_URI[deb0.sha256sum] = "90da6665b0c2a08f671b04e0cd38bac721548829d99d5c534c4d7fd69566914d"
SRC_URI[deb0.md5sum] = "1cdd9ba4b56b418fd9ded01b956f427d"

RDEPENDS_python-${PN} = "python2.7 python (>= 2.6.6-7~) python (<< 2.8)"
DEPENDS = "python python2.7"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-six = " \
	./usr/share/doc/python-six/changelog.Debian.gz \
	./usr/share/pyshared/six.py \
	./usr/lib/python2.7/dist-packages/six-1.1.0.egg-info \
	./usr/lib/python2.6/dist-packages/six.py \
	./usr/lib/python2.6/dist-packages/six-1.1.0.egg-info \
	./usr/share/doc/python-six/copyright \
	./usr/lib/python2.7/dist-packages/six.py\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
