PACKAGES = "${PN} python-requests"
PROVIDES = "python-requests"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/r/requests/python-requests_2.21.0-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-requests = "python-requests_2.21.0-1_all.deb"
SRC_URI[deb0.sha256sum] = "b1f0ac9e3947c748b9c2b6bffee96329771deeff1dd8606906786dd17ab62e7b"
SRC_URI[deb0.md5sum] = "6cfa984ea0873f1f095b2dc0dd36886a"

RDEPENDS_python-${PN} = "ca-certificates python (<< 2.8) python (>= 2.7~) python-certifi python-chardet (<< 3.1.0) python-chardet (>= 3.0.2) python-idna python-urllib3 (<< 1.25) python-urllib3 (>= 1.21.1)"
DEPENDS = "ca-certificates python python-certifi python-chardet python-idna python-urllib3"


inherit deb_group

FILES_python-requests = " \
    ./usr/lib/python2.7/dist-packages/requests-2.21.0.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/requests-2.21.0.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/requests-2.21.0.egg-info/not-zip-safe \
    ./usr/lib/python2.7/dist-packages/requests-2.21.0.egg-info/requires.txt \
    ./usr/lib/python2.7/dist-packages/requests-2.21.0.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/requests/__init__.py \
    ./usr/lib/python2.7/dist-packages/requests/__version__.py \
    ./usr/lib/python2.7/dist-packages/requests/_internal_utils.py \
    ./usr/lib/python2.7/dist-packages/requests/adapters.py \
    ./usr/lib/python2.7/dist-packages/requests/api.py \
    ./usr/lib/python2.7/dist-packages/requests/auth.py \
    ./usr/lib/python2.7/dist-packages/requests/certs.py \
    ./usr/lib/python2.7/dist-packages/requests/compat.py \
    ./usr/lib/python2.7/dist-packages/requests/cookies.py \
    ./usr/lib/python2.7/dist-packages/requests/exceptions.py \
    ./usr/lib/python2.7/dist-packages/requests/help.py \
    ./usr/lib/python2.7/dist-packages/requests/hooks.py \
    ./usr/lib/python2.7/dist-packages/requests/models.py \
    ./usr/lib/python2.7/dist-packages/requests/packages.py \
    ./usr/lib/python2.7/dist-packages/requests/sessions.py \
    ./usr/lib/python2.7/dist-packages/requests/status_codes.py \
    ./usr/lib/python2.7/dist-packages/requests/structures.py \
    ./usr/lib/python2.7/dist-packages/requests/utils.py \
    ./usr/share/doc/python-requests/README.md \
    ./usr/share/doc/python-requests/changelog.Debian.gz \
    ./usr/share/doc/python-requests/changelog.gz \
    ./usr/share/doc/python-requests/copyright\
"
