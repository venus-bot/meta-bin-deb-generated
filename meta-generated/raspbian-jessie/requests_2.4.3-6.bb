PACKAGES = "${PN} python-requests"
PROVIDES = "python-requests"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/r/requests/python-requests_2.4.3-6_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-requests = "python-requests_2.4.3-6_all.deb"
SRC_URI[deb0.sha256sum] = "6ff5c6a721286e78750e9ba071486ec4306994fb064b29bd59f8e07d7f64de6a"
SRC_URI[deb0.md5sum] = "92533571f12be406824aa8a7971fdb95"

RDEPENDS_python-${PN} = "python (<< 2.8) python (>= 2.7.5-5~) ca-certificates python-chardet python-urllib3 (>= 1.9.1)"
DEPENDS = "python-chardet python python-urllib3 ca-certificates"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-requests = " \
    ./usr/lib/python2.7/dist-packages/requests-2.4.3.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/requests-2.4.3.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/requests-2.4.3.egg-info/not-zip-safe \
    ./usr/lib/python2.7/dist-packages/requests-2.4.3.egg-info/requires.txt \
    ./usr/lib/python2.7/dist-packages/requests-2.4.3.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/requests/__init__.py \
    ./usr/lib/python2.7/dist-packages/requests/adapters.py \
    ./usr/lib/python2.7/dist-packages/requests/api.py \
    ./usr/lib/python2.7/dist-packages/requests/auth.py \
    ./usr/lib/python2.7/dist-packages/requests/cacert.pem \
    ./usr/lib/python2.7/dist-packages/requests/certs.py \
    ./usr/lib/python2.7/dist-packages/requests/compat.py \
    ./usr/lib/python2.7/dist-packages/requests/cookies.py \
    ./usr/lib/python2.7/dist-packages/requests/exceptions.py \
    ./usr/lib/python2.7/dist-packages/requests/hooks.py \
    ./usr/lib/python2.7/dist-packages/requests/models.py \
    ./usr/lib/python2.7/dist-packages/requests/packages/__init__.py \
    ./usr/lib/python2.7/dist-packages/requests/packages/urllib3 \
    ./usr/lib/python2.7/dist-packages/requests/sessions.py \
    ./usr/lib/python2.7/dist-packages/requests/status_codes.py \
    ./usr/lib/python2.7/dist-packages/requests/structures.py \
    ./usr/lib/python2.7/dist-packages/requests/utils.py \
    ./usr/share/doc/python-requests/README.rst \
    ./usr/share/doc/python-requests/changelog.Debian.gz \
    ./usr/share/doc/python-requests/changelog.gz \
    ./usr/share/doc/python-requests/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
