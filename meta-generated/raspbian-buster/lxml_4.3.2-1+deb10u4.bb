PACKAGES = "${PN} python-lxml python3-lxml"
PROVIDES = "python-lxml python3-lxml"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lxml/python-lxml_4.3.2-1+deb10u4_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/l/lxml/python3-lxml_4.3.2-1+deb10u4_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-lxml = "python-lxml_4.3.2-1+deb10u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "7a5324e80fad16189bdca8264119b8db80f0dd17d2555c9e8dc61d877c67fd10"
SRC_URI[deb0.md5sum] = "3d9690d1251e3169c296d4d7a32d2e06"
DEBFILENAME_python3-lxml = "python3-lxml_4.3.2-1+deb10u4_armhf.deb"
SRC_URI[deb1.sha256sum] = "9bc2d3afc78196d63bb3bc67b537ffb6a11d32986a06a7c405b5909e563ccb55"
SRC_URI[deb1.md5sum] = "4929220c0ffd3964b29d2edcbd58185e"

RDEPENDS_python-${PN} = "libc6 (>= 2.4) libxml2 (>= 2.9.0) libxslt1.1 (>= 1.1.26) python (<< 2.8) python (<< 2.8) python (>= 2.7~) python (>= 2.7~) zlib1g (>= 1:1.1.4)"
RDEPENDS_python3-${PN} = "libc6 (>= 2.4) libxml2 (>= 2.9.0) libxslt1.1 (>= 1.1.26) python3 python3 (<< 3.8) python3 (>= 3.7~) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libxml2 libxslt1.1 python python3 zlib1g"


inherit deb_group

FILES_python-lxml = " \
    ./usr/lib/python2.7/dist-packages/lxml-4.3.2.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/lxml-4.3.2.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/lxml-4.3.2.egg-info/not-zip-safe \
    ./usr/lib/python2.7/dist-packages/lxml-4.3.2.egg-info/requires.txt \
    ./usr/lib/python2.7/dist-packages/lxml-4.3.2.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/lxml/ElementInclude.py \
    ./usr/lib/python2.7/dist-packages/lxml/__init__.py \
    ./usr/lib/python2.7/dist-packages/lxml/_elementpath.arm-linux-gnueabihf.so \
    ./usr/lib/python2.7/dist-packages/lxml/_elementpath.py \
    ./usr/lib/python2.7/dist-packages/lxml/builder.arm-linux-gnueabihf.so \
    ./usr/lib/python2.7/dist-packages/lxml/builder.py \
    ./usr/lib/python2.7/dist-packages/lxml/cssselect.py \
    ./usr/lib/python2.7/dist-packages/lxml/doctestcompare.py \
    ./usr/lib/python2.7/dist-packages/lxml/etree.arm-linux-gnueabihf.so \
    ./usr/lib/python2.7/dist-packages/lxml/etree.h \
    ./usr/lib/python2.7/dist-packages/lxml/etree_api.h \
    ./usr/lib/python2.7/dist-packages/lxml/html/ElementSoup.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/__init__.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/_diffcommand.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/_html5builder.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/_setmixin.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/builder.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/clean.arm-linux-gnueabihf.so \
    ./usr/lib/python2.7/dist-packages/lxml/html/clean.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/defs.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/diff.arm-linux-gnueabihf.so \
    ./usr/lib/python2.7/dist-packages/lxml/html/diff.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/formfill.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/html5parser.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/soupparser.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/usedoctest.py \
    ./usr/lib/python2.7/dist-packages/lxml/includes/__init__.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/__init__.py \
    ./usr/lib/python2.7/dist-packages/lxml/includes/c14n.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/config.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/dtdvalid.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/etree_defs.h \
    ./usr/lib/python2.7/dist-packages/lxml/includes/etreepublic.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/htmlparser.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/lxml-version.h \
    ./usr/lib/python2.7/dist-packages/lxml/includes/relaxng.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/schematron.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/tree.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/uri.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xinclude.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xmlerror.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xmlparser.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xmlschema.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xpath.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xslt.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/__init__.py \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/rng/iso-schematron.rng \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/RNG2Schtrn.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/XSD2Schtrn.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_abstract_expand.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_dsdl_include.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_message.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_skeleton_for_xslt1.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_svrl_for_xslt1.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/readme.txt \
    ./usr/lib/python2.7/dist-packages/lxml/lxml.etree.h \
    ./usr/lib/python2.7/dist-packages/lxml/lxml.etree_api.h \
    ./usr/lib/python2.7/dist-packages/lxml/objectify.arm-linux-gnueabihf.so \
    ./usr/lib/python2.7/dist-packages/lxml/pyclasslookup.py \
    ./usr/lib/python2.7/dist-packages/lxml/sax.arm-linux-gnueabihf.so \
    ./usr/lib/python2.7/dist-packages/lxml/sax.py \
    ./usr/lib/python2.7/dist-packages/lxml/usedoctest.py \
    ./usr/share/doc/python-lxml/CREDITS.txt \
    ./usr/share/doc/python-lxml/README.rst \
    ./usr/share/doc/python-lxml/TODO.txt \
    ./usr/share/doc/python-lxml/changelog.Debian.gz \
    ./usr/share/doc/python-lxml/changelog.gz \
    ./usr/share/doc/python-lxml/copyright \
    ./usr/share/doc/python-lxml/examples/simple-ns.xml \
    ./usr/share/doc/python-lxml/examples/simple.xml\
"
FILES_python3-lxml = " \
    ./usr/lib/python3/dist-packages/lxml-4.3.2.egg-info/PKG-INFO \
    ./usr/lib/python3/dist-packages/lxml-4.3.2.egg-info/dependency_links.txt \
    ./usr/lib/python3/dist-packages/lxml-4.3.2.egg-info/not-zip-safe \
    ./usr/lib/python3/dist-packages/lxml-4.3.2.egg-info/requires.txt \
    ./usr/lib/python3/dist-packages/lxml-4.3.2.egg-info/top_level.txt \
    ./usr/lib/python3/dist-packages/lxml/ElementInclude.py \
    ./usr/lib/python3/dist-packages/lxml/__init__.py \
    ./usr/lib/python3/dist-packages/lxml/_elementpath.cpython-37m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/lxml/_elementpath.py \
    ./usr/lib/python3/dist-packages/lxml/builder.cpython-37m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/lxml/builder.py \
    ./usr/lib/python3/dist-packages/lxml/cssselect.py \
    ./usr/lib/python3/dist-packages/lxml/doctestcompare.py \
    ./usr/lib/python3/dist-packages/lxml/etree.cpython-37m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/lxml/etree.h \
    ./usr/lib/python3/dist-packages/lxml/etree_api.h \
    ./usr/lib/python3/dist-packages/lxml/html/ElementSoup.py \
    ./usr/lib/python3/dist-packages/lxml/html/__init__.py \
    ./usr/lib/python3/dist-packages/lxml/html/_diffcommand.py \
    ./usr/lib/python3/dist-packages/lxml/html/_html5builder.py \
    ./usr/lib/python3/dist-packages/lxml/html/_setmixin.py \
    ./usr/lib/python3/dist-packages/lxml/html/builder.py \
    ./usr/lib/python3/dist-packages/lxml/html/clean.cpython-37m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/lxml/html/clean.py \
    ./usr/lib/python3/dist-packages/lxml/html/defs.py \
    ./usr/lib/python3/dist-packages/lxml/html/diff.cpython-37m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/lxml/html/diff.py \
    ./usr/lib/python3/dist-packages/lxml/html/formfill.py \
    ./usr/lib/python3/dist-packages/lxml/html/html5parser.py \
    ./usr/lib/python3/dist-packages/lxml/html/soupparser.py \
    ./usr/lib/python3/dist-packages/lxml/html/usedoctest.py \
    ./usr/lib/python3/dist-packages/lxml/includes/__init__.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/__init__.py \
    ./usr/lib/python3/dist-packages/lxml/includes/c14n.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/config.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/dtdvalid.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/etree_defs.h \
    ./usr/lib/python3/dist-packages/lxml/includes/etreepublic.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/htmlparser.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/lxml-version.h \
    ./usr/lib/python3/dist-packages/lxml/includes/relaxng.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/schematron.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/tree.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/uri.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/xinclude.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/xmlerror.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/xmlparser.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/xmlschema.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/xpath.pxd \
    ./usr/lib/python3/dist-packages/lxml/includes/xslt.pxd \
    ./usr/lib/python3/dist-packages/lxml/isoschematron/__init__.py \
    ./usr/lib/python3/dist-packages/lxml/isoschematron/resources/rng/iso-schematron.rng \
    ./usr/lib/python3/dist-packages/lxml/isoschematron/resources/xsl/RNG2Schtrn.xsl \
    ./usr/lib/python3/dist-packages/lxml/isoschematron/resources/xsl/XSD2Schtrn.xsl \
    ./usr/lib/python3/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_abstract_expand.xsl \
    ./usr/lib/python3/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_dsdl_include.xsl \
    ./usr/lib/python3/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_message.xsl \
    ./usr/lib/python3/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_skeleton_for_xslt1.xsl \
    ./usr/lib/python3/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_svrl_for_xslt1.xsl \
    ./usr/lib/python3/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/readme.txt \
    ./usr/lib/python3/dist-packages/lxml/lxml.etree.h \
    ./usr/lib/python3/dist-packages/lxml/lxml.etree_api.h \
    ./usr/lib/python3/dist-packages/lxml/objectify.cpython-37m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/lxml/pyclasslookup.py \
    ./usr/lib/python3/dist-packages/lxml/sax.cpython-37m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/lxml/sax.py \
    ./usr/lib/python3/dist-packages/lxml/usedoctest.py \
    ./usr/share/doc/python3-lxml/changelog.Debian.gz \
    ./usr/share/doc/python3-lxml/changelog.gz \
    ./usr/share/doc/python3-lxml/copyright\
"
