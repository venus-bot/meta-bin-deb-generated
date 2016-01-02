PACKAGES = "python-six"
PROVIDES = "python-six"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/six/python-six_1.8.0-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-six = "python-six_1.8.0-1_all.deb"
SRC_URI[deb0.sha256sum] = "15e635be0154af9232cb30b10df8c598a274a9b55bbe5c0355aff51cc1e63e88"
SRC_URI[deb0.md5sum] = "0b6d5318373ee4eb069e375a5e2aa0b1"

RDEPENDS_python-${PN} = "python (>= 2.7.5-5~) python (<< 2.8)"
DEPENDS = "python"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-six = " \
	./usr/share/doc/python-six/changelog.Debian.gz \
	./usr/share/doc/python-six/changelog.gz \
	./usr/lib/python2.7/dist-packages/six-1.8.0.egg-info/dependency_links.txt \
	./usr/lib/python2.7/dist-packages/six-1.8.0.egg-info/PKG-INFO \
	./usr/share/doc/python-six/copyright \
	./usr/lib/python2.7/dist-packages/six.py \
	./usr/lib/python2.7/dist-packages/six-1.8.0.egg-info/top_level.txt\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
