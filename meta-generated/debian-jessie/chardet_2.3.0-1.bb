PACKAGES = "python-chardet"
PROVIDES = "python-chardet"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/c/chardet/python-chardet_2.3.0-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-chardet = "python-chardet_2.3.0-1_all.deb"
SRC_URI[deb0.sha256sum] = "12e634df582e3e17a1199279def572e0009edb9815807b96f3888a259cd3b888"
SRC_URI[deb0.md5sum] = "842d486800e90fad8d3f573360d4378e"

RDEPENDS_python-${PN} = "python (>= 2.7.5-5~) python python (<< 2.8) python-pkg-resources"
DEPENDS = "python python-pkg-resources"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-chardet = " \
	./usr/lib/python2.7/dist-packages/chardet/sjisprober.py \
	./usr/lib/python2.7/dist-packages/chardet/langhebrewmodel.py \
	./usr/lib/python2.7/dist-packages/chardet/langbulgarianmodel.py \
	./usr/lib/python2.7/dist-packages/chardet/charsetprober.py \
	./usr/lib/python2.7/dist-packages/chardet/mbcssm.py \
	./usr/lib/python2.7/dist-packages/chardet/universaldetector.py \
	./usr/lib/python2.7/dist-packages/chardet-2.3.0.egg-info/top_level.txt \
	./usr/lib/python2.7/dist-packages/chardet/eucjpprober.py \
	./usr/lib/python2.7/dist-packages/chardet/chardetect.py \
	./usr/lib/python2.7/dist-packages/chardet/langgreekmodel.py \
	./usr/lib/python2.7/dist-packages/chardet/codingstatemachine.py \
	./usr/lib/python2.7/dist-packages/chardet/gb2312prober.py \
	./usr/lib/python2.7/dist-packages/chardet/euckrfreq.py \
	./usr/lib/python2.7/dist-packages/chardet/mbcsgroupprober.py \
	./usr/lib/python2.7/dist-packages/chardet/gb2312freq.py \
	./usr/share/doc/python-chardet/changelog.Debian.gz \
	./usr/lib/python2.7/dist-packages/chardet/constants.py \
	./usr/bin/chardet \
	./usr/lib/python2.7/dist-packages/chardet-2.3.0.egg-info/entry_points.txt \
	./usr/lib/python2.7/dist-packages/chardet/langcyrillicmodel.py \
	./usr/share/man/man1/chardet.1.gz \
	./usr/lib/python2.7/dist-packages/chardet/mbcharsetprober.py \
	./usr/lib/python2.7/dist-packages/chardet/sbcharsetprober.py \
	./usr/lib/python2.7/dist-packages/chardet/jisfreq.py \
	./usr/lib/python2.7/dist-packages/chardet-2.3.0.egg-info/PKG-INFO \
	./usr/lib/python2.7/dist-packages/chardet/latin1prober.py \
	./usr/lib/python2.7/dist-packages/chardet/hebrewprober.py \
	./usr/share/man/man1/chardetect.1.gz \
	./usr/bin/chardetect \
	./usr/lib/python2.7/dist-packages/chardet/escsm.py \
	./usr/lib/python2.7/dist-packages/chardet/euckrprober.py \
	./usr/lib/python2.7/dist-packages/chardet/langhungarianmodel.py \
	./usr/lib/python2.7/dist-packages/chardet/big5freq.py \
	./usr/lib/python2.7/dist-packages/chardet-2.3.0.egg-info/dependency_links.txt \
	./usr/lib/python2.7/dist-packages/chardet/escprober.py \
	./usr/lib/python2.7/dist-packages/chardet/utf8prober.py \
	./usr/lib/python2.7/dist-packages/chardet/big5prober.py \
	./usr/lib/python2.7/dist-packages/chardet/jpcntx.py \
	./usr/lib/python2.7/dist-packages/chardet/euctwfreq.py \
	./usr/lib/python2.7/dist-packages/chardet/chardistribution.py \
	./usr/lib/python2.7/dist-packages/chardet/langthaimodel.py \
	./usr/lib/python2.7/dist-packages/chardet/sbcsgroupprober.py \
	./usr/lib/python2.7/dist-packages/chardet/euctwprober.py \
	./usr/lib/python2.7/dist-packages/chardet/cp949prober.py \
	./usr/lib/python2.7/dist-packages/chardet/__init__.py \
	./usr/lib/python2.7/dist-packages/chardet/charsetgroupprober.py \
	./usr/lib/python2.7/dist-packages/chardet/compat.py \
	./usr/share/doc/python-chardet/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
