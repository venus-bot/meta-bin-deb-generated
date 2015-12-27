PACKAGES = "python-requests"
PROVIDES = "python-requests"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/r/requests/python-requests_0.12.1-1+deb7u1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-requests = "python-requests_0.12.1-1+deb7u1_all.deb"
SRC_URI[deb0.sha256sum] = "2de76723ce8ffc2e53aa2888d50430e40c393d45a516b9dfa6e651c982497f3b"
SRC_URI[deb0.md5sum] = "c1876873d0e24fc420934f0c076461e3"

RDEPENDS_python-${PN} = "python (>= 2.6.6-7~) python (<< 2.8) ca-certificates python-six"
DEPENDS = "python ca-certificates python-six"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-requests = " \
	./usr/lib/python2.7/dist-packages/requests/defaults.py \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/exceptions.py \
	./usr/share/pyshared/requests/packages/urllib3/exceptions.py \
	./usr/share/pyshared/requests/sessions.py \
	./usr/lib/python2.6/dist-packages/requests/hooks.py \
	./usr/lib/python2.7/dist-packages/requests/exceptions.py \
	./usr/share/pyshared/requests/packages/urllib3/_collections.py \
	./usr/share/pyshared/requests/packages/urllib3/util.py \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/exceptions.py \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/packages/__init__.py \
	./usr/lib/python2.7/dist-packages/requests/packages/__init__.py \
	./usr/share/pyshared/requests/packages/urllib3/packages/mimetools_choose_boundary/__init__.py \
	./usr/lib/python2.6/dist-packages/requests/defaults.py \
	./usr/lib/python2.6/dist-packages/requests/cookies.py \
	./usr/lib/python2.6/dist-packages/requests/utils.py \
	./usr/lib/python2.6/dist-packages/requests-0.12.1.egg-info \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/__init__.py \
	./usr/lib/python2.6/dist-packages/requests/async.py \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/_collections.py \
	./usr/share/pyshared/requests/hooks.py \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/response.py \
	./usr/lib/python2.7/dist-packages/requests/auth.py \
	./usr/share/doc/python-requests/copyright \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/packages/mimetools_choose_boundary/__init__.py \
	./usr/share/pyshared/requests/packages/urllib3/__init__.py \
	./usr/lib/python2.6/dist-packages/requests/__init__.py \
	./usr/share/doc/python-requests/changelog.Debian.gz \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/packages/__init__.py \
	./usr/lib/python2.6/dist-packages/requests/sessions.py \
	./usr/share/pyshared/requests/packages/urllib3/connectionpool.py \
	./usr/share/doc/python-requests/README.rst \
	./usr/lib/python2.7/dist-packages/requests/hooks.py \
	./usr/lib/python2.7/dist-packages/requests/__init__.py \
	./usr/lib/python2.7/dist-packages/requests/utils.py \
	./usr/share/pyshared/requests/packages/urllib3/packages/ssl_match_hostname/__init__.py \
	./usr/lib/python2.6/dist-packages/requests/compat.py \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/connectionpool.py \
	./usr/share/pyshared/requests/packages/urllib3/packages/__init__.py \
	./usr/share/pyshared/requests/status_codes.py \
	./usr/share/pyshared/requests/async.py \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/_collections.py \
	./usr/lib/python2.6/dist-packages/requests/packages/__init__.py \
	./usr/share/pyshared/requests/structures.py \
	./usr/lib/python2.7/dist-packages/requests-0.12.1.egg-info \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/poolmanager.py \
	./usr/share/pyshared/requests/auth.py \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/packages/ssl_match_hostname/__init__.py \
	./usr/lib/python2.7/dist-packages/requests/status_codes.py \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/util.py \
	./usr/share/pyshared/requests/packages/urllib3/filepost.py \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/request.py \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/util.py \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/poolmanager.py \
	./usr/lib/python2.7/dist-packages/requests/structures.py \
	./usr/lib/python2.6/dist-packages/requests/models.py \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/packages/ssl_match_hostname/__init__.py \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/packages/mimetools_choose_boundary/__init__.py \
	./usr/lib/python2.7/dist-packages/requests/sessions.py \
	./usr/share/pyshared/requests/packages/urllib3/response.py \
	./usr/share/pyshared/requests/api.py \
	./usr/lib/python2.6/dist-packages/requests/structures.py \
	./usr/lib/python2.6/dist-packages/requests/api.py \
	./usr/share/pyshared/requests/utils.py \
	./usr/lib/python2.6/dist-packages/requests/status_codes.py \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/filepost.py \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/response.py \
	./usr/share/pyshared/requests/packages/urllib3/poolmanager.py \
	./usr/share/pyshared/requests/defaults.py \
	./usr/share/pyshared/requests-0.12.1.egg-info \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/filepost.py \
	./usr/lib/python2.7/dist-packages/requests/api.py \
	./usr/share/pyshared/requests/__init__.py \
	./usr/share/pyshared/requests/cookies.py \
	./usr/share/pyshared/requests/models.py \
	./usr/lib/python2.6/dist-packages/requests/exceptions.py \
	./usr/share/pyshared/requests/packages/__init__.py \
	./usr/lib/python2.7/dist-packages/requests/packages/urllib3/connectionpool.py \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/__init__.py \
	./usr/share/pyshared/requests/exceptions.py \
	./usr/lib/python2.7/dist-packages/requests/cookies.py \
	./usr/lib/python2.7/dist-packages/requests/models.py \
	./usr/share/pyshared/requests/packages/urllib3/request.py \
	./usr/lib/python2.6/dist-packages/requests/packages/urllib3/request.py \
	./usr/lib/python2.6/dist-packages/requests/auth.py \
	./usr/share/doc/python-requests/changelog.gz \
	./usr/lib/python2.7/dist-packages/requests/async.py \
	./usr/share/pyshared/requests/compat.py \
	./usr/lib/python2.7/dist-packages/requests/compat.py\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
