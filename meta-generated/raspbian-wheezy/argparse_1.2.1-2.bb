PACKAGES = "python-argparse"
PROVIDES = "python-argparse"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/a/argparse/python-argparse_1.2.1-2_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-argparse = "python-argparse_1.2.1-2_all.deb"
SRC_URI[deb0.sha256sum] = "94d4a9700b1494eb72a437c68bda4b97ab15c9068256fbf7566d77908498cc03"
SRC_URI[deb0.md5sum] = "deadfeb537cd303ee66ed7ac3460c493"

RDEPENDS_python-${PN} = "python2.6 python (>= 2.6.6-7~)"
DEPENDS = "python python2.6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-argparse = " \
	./usr/share/pyshared/argparse-1.2.1.egg-info/top_level.txt \
	./usr/share/pyshared/argparse-1.2.1.egg-info/PKG-INFO \
	./usr/share/doc/python-argparse/copyright \
	./usr/lib/python2.6/dist-packages/argparse.py \
	./usr/share/pyshared/argparse-1.2.1.egg-info/dependency_links.txt \
	./usr/share/doc/python-argparse/changelog.Debian.gz \
	./usr/lib/python2.6/dist-packages/argparse-1.2.1.egg-info/PKG-INFO \
	./usr/share/doc/python-argparse/examples/test_argparse.py \
	./usr/share/doc/python-argparse/html \
	./usr/lib/python2.6/dist-packages/argparse-1.2.1.egg-info/SOURCES.txt \
	./usr/lib/python2.6/dist-packages/argparse-1.2.1.egg-info/top_level.txt \
	./usr/share/pyshared/argparse-1.2.1.egg-info/SOURCES.txt \
	./usr/lib/python2.6/dist-packages/argparse-1.2.1.egg-info/dependency_links.txt \
	./usr/share/doc/python-argparse/README.txt \
	./usr/share/pyshared/argparse.py\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
