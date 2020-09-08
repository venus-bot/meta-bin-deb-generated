PACKAGES = "${PN} python-chardet"
PROVIDES = "python-chardet"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/c/chardet/python-chardet_3.0.4-3_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-chardet = "python-chardet_3.0.4-3_all.deb"
SRC_URI[deb0.sha256sum] = "e651844feb255b96ad170eb3e2180a38dd05b06464f27f2d200c7cf34e7b4657"
SRC_URI[deb0.md5sum] = "b783b428cb6f32d3c37305059f5a279d"

RDEPENDS_python-${PN} = "python (<< 2.8) python (>= 2.7~) python-pkg-resources"
DEPENDS = "python python-pkg-resources"


inherit deb_group

FILES_python-chardet = " \
    ./usr/bin/chardet \
    ./usr/bin/chardetect \
    ./usr/lib/python2.7/dist-packages/chardet-3.0.4.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/chardet-3.0.4.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/chardet-3.0.4.egg-info/entry_points.txt \
    ./usr/lib/python2.7/dist-packages/chardet-3.0.4.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/chardet/__init__.py \
    ./usr/lib/python2.7/dist-packages/chardet/big5freq.py \
    ./usr/lib/python2.7/dist-packages/chardet/big5prober.py \
    ./usr/lib/python2.7/dist-packages/chardet/chardistribution.py \
    ./usr/lib/python2.7/dist-packages/chardet/charsetgroupprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/charsetprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/cli/__init__.py \
    ./usr/lib/python2.7/dist-packages/chardet/cli/chardetect.py \
    ./usr/lib/python2.7/dist-packages/chardet/codingstatemachine.py \
    ./usr/lib/python2.7/dist-packages/chardet/compat.py \
    ./usr/lib/python2.7/dist-packages/chardet/cp949prober.py \
    ./usr/lib/python2.7/dist-packages/chardet/enums.py \
    ./usr/lib/python2.7/dist-packages/chardet/escprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/escsm.py \
    ./usr/lib/python2.7/dist-packages/chardet/eucjpprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/euckrfreq.py \
    ./usr/lib/python2.7/dist-packages/chardet/euckrprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/euctwfreq.py \
    ./usr/lib/python2.7/dist-packages/chardet/euctwprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/gb2312freq.py \
    ./usr/lib/python2.7/dist-packages/chardet/gb2312prober.py \
    ./usr/lib/python2.7/dist-packages/chardet/hebrewprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/jisfreq.py \
    ./usr/lib/python2.7/dist-packages/chardet/jpcntx.py \
    ./usr/lib/python2.7/dist-packages/chardet/langbulgarianmodel.py \
    ./usr/lib/python2.7/dist-packages/chardet/langcyrillicmodel.py \
    ./usr/lib/python2.7/dist-packages/chardet/langgreekmodel.py \
    ./usr/lib/python2.7/dist-packages/chardet/langhebrewmodel.py \
    ./usr/lib/python2.7/dist-packages/chardet/langhungarianmodel.py \
    ./usr/lib/python2.7/dist-packages/chardet/langthaimodel.py \
    ./usr/lib/python2.7/dist-packages/chardet/langturkishmodel.py \
    ./usr/lib/python2.7/dist-packages/chardet/latin1prober.py \
    ./usr/lib/python2.7/dist-packages/chardet/mbcharsetprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/mbcsgroupprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/mbcssm.py \
    ./usr/lib/python2.7/dist-packages/chardet/sbcharsetprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/sbcsgroupprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/sjisprober.py \
    ./usr/lib/python2.7/dist-packages/chardet/universaldetector.py \
    ./usr/lib/python2.7/dist-packages/chardet/utf8prober.py \
    ./usr/lib/python2.7/dist-packages/chardet/version.py \
    ./usr/share/doc/python-chardet/changelog.Debian.gz \
    ./usr/share/doc/python-chardet/copyright \
    ./usr/share/man/man1/chardet.1.gz \
    ./usr/share/man/man1/chardetect.1.gz\
"
