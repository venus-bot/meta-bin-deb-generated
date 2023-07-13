PACKAGES = "${PN} python-requests python3-requests"
PROVIDES = "python-requests python3-requests"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/r/requests/python-requests_2.21.0-1+deb10u1_all.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/r/requests/python3-requests_2.21.0-1+deb10u1_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-requests = "python-requests_2.21.0-1+deb10u1_all.deb"
SRC_URI[deb0.sha256sum] = "397a9dc1ee532f29f2a3d14a5ceebb8ae6453fdffbc82392646d6a200475d679"
SRC_URI[deb0.md5sum] = "27900a3c381b013320968335889104ab"
DEBFILENAME_python3-requests = "python3-requests_2.21.0-1+deb10u1_all.deb"
SRC_URI[deb1.sha256sum] = "532a0977d7fe0c91878e628c9304ef6ad8073cf63932a2ce62133599e8a354bc"
SRC_URI[deb1.md5sum] = "05788d8b280472bd6c1f9826d11412d6"

RDEPENDS_python-${PN} = "ca-certificates python (<< 2.8) python (>= 2.7~) python-certifi python-chardet (<< 3.1.0) python-chardet (>= 3.0.2) python-idna python-urllib3 (<< 1.25) python-urllib3 (>= 1.21.1)"
RDEPENDS_python3-${PN} = "ca-certificates python3 python3-certifi python3-chardet (<< 3.1.0) python3-chardet (>= 3.0.2) python3-idna python3-urllib3 (<< 1.25) python3-urllib3 (>= 1.21.1)"
DEPENDS = "ca-certificates python python-certifi python-chardet python-idna python-urllib3 python3 python3-certifi python3-chardet python3-idna python3-urllib3"


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
FILES_python3-requests = " \
    ./usr/lib/python3/dist-packages/requests-2.21.0.egg-info/PKG-INFO \
    ./usr/lib/python3/dist-packages/requests-2.21.0.egg-info/dependency_links.txt \
    ./usr/lib/python3/dist-packages/requests-2.21.0.egg-info/not-zip-safe \
    ./usr/lib/python3/dist-packages/requests-2.21.0.egg-info/requires.txt \
    ./usr/lib/python3/dist-packages/requests-2.21.0.egg-info/top_level.txt \
    ./usr/lib/python3/dist-packages/requests/__init__.py \
    ./usr/lib/python3/dist-packages/requests/__version__.py \
    ./usr/lib/python3/dist-packages/requests/_internal_utils.py \
    ./usr/lib/python3/dist-packages/requests/adapters.py \
    ./usr/lib/python3/dist-packages/requests/api.py \
    ./usr/lib/python3/dist-packages/requests/auth.py \
    ./usr/lib/python3/dist-packages/requests/certs.py \
    ./usr/lib/python3/dist-packages/requests/compat.py \
    ./usr/lib/python3/dist-packages/requests/cookies.py \
    ./usr/lib/python3/dist-packages/requests/exceptions.py \
    ./usr/lib/python3/dist-packages/requests/help.py \
    ./usr/lib/python3/dist-packages/requests/hooks.py \
    ./usr/lib/python3/dist-packages/requests/models.py \
    ./usr/lib/python3/dist-packages/requests/packages.py \
    ./usr/lib/python3/dist-packages/requests/sessions.py \
    ./usr/lib/python3/dist-packages/requests/status_codes.py \
    ./usr/lib/python3/dist-packages/requests/structures.py \
    ./usr/lib/python3/dist-packages/requests/utils.py \
    ./usr/share/doc/python3-requests/changelog.Debian.gz \
    ./usr/share/doc/python3-requests/changelog.gz \
    ./usr/share/doc/python3-requests/copyright\
"
